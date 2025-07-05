// 변수 선언 예약어 : var, let
// 문서에서 id가 heading인 DOM 객체를 heading 변수에 저장
let heading = document.querySelector('#heading')

// heading이 클릭이 되었을 때 빨간색으로 변환됨
heading.onclick = function () {
  heading.style.color = 'red'
}
