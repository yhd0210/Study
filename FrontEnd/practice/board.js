const pageSize = 10;
const pagesPerSet = 10; // 한 세트당 페이지 수

let posts;
let totalPage = 999999;
let currentPage;
let startPage;
let endPage;

const $tbody = $("tbody");
const $pagination = $(".pagination");

$(document).ready(function () {
  loadPage(1);
});

function loadPage(number) {
  if (number >= 1 && number <= totalPage) {
    currentPage = number;
  } else if (number < 1) {
    alert("이전 페이지가 없습니다.");
  } else {
    alert("다음 페이지가 없습니다.");
  }

  $.ajax({
    type: "get",
    url: "https://jsonplaceholder.typicode.com/posts", // 대체 예정
    // async: false,
    success: function (data) {
      data.sort((a, b) => b.id - a.id);
      posts = data;

      if (posts) {
        reset();
        setBoard();
        setPagination();
      }
    },
    error: function (request, status, error) {
      console.log(error);
    },
  });
}

function reset() {
  $tbody.empty();
  $pagination.empty();
}

function setBoard() {
  totalPage = Math.ceil(posts.length / pageSize);

  const startIndex = (currentPage - 1) * pageSize;
  const endIndex = currentPage * pageSize;

  posts.slice(startIndex, endIndex).forEach((post) => {
    const $tr = $("<tr></tr>");
    const $tdId = $("<td></td>").text(post.id);
    const $tdTitle = $("<td></td>").text(post.title);
    const $tdCreatedAt = $("<td></td>").text(
      new Date(post.createdAt).toLocaleDateString()
    );
    const $tdDelete = $(
      '<td><button class="btn btn-danger" onclick="deleteRow(this)">삭제</a></td>'
    );

    $tr.append($tdId, $tdTitle, $tdCreatedAt, $tdDelete);
    $tbody.append($tr);
  });
}

function setPagination() {
  startPage = Math.max(
    1,
    Math.floor((currentPage - 1) / pagesPerSet) * pagesPerSet + 1
  );
  endPage = Math.min(totalPage, startPage + pagesPerSet - 1);

  const $previous = $(
    `<li><a href="javascript:loadPage(${
      startPage - 10
    })" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>`
  );
  const $next = $(
    `<li><a href="javascript:loadPage(${
      endPage + 1
    })" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>`
  );

  let count = 1;

  for (let i = startPage; i <= endPage; i++) {
    const $page = $(
      `<li ${
        currentPage === i ? 'class="active"' : ""
      }><a href="javascript:loadPage(${i})">${i}</a></li>`
    );
    $pagination.append($page);
  }

  $pagination.prepend($previous);
  $pagination.append($next);
}

function deleteRow(e) {
  e.parentElement.parentElement.remove();
  // $(e).closest('tr').remove();
}
