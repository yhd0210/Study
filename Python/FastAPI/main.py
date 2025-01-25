from fastapi import FastAPI, Query
from typing import Optional, Union, List
from enum import Enum
from pydantic import BaseModel

class Item(BaseModel):
    name: str
    description: str | None = None
    price: float
    tax: float | None = None

class ModelName(str, Enum):
    alexnet = "alexnet"
    resnet = "resnet"
    lenet = "lenet"

fake_items_db = [
    {"item_name": "Foo"},
    {"item_name": "Bar"},
    {"item_name": "Baz"}
]

app = FastAPI()

@app.post("/items/{item_id}")
async def update_item(item_id:int, item:Item, q:str | None = None):
    result = {"item_id":item_id, **item.model_dump()}
    if q:
        result.update({"q":q})
    return result

@app.post("/items/")
async def create_item(item: Item):
    item_dict = item.model_dump()
    if item.tax:
        price_with_tax = item.price + item.tax
        item_dict.update({"price_with_tax":price_with_tax})
    return item_dict

@app.get("/users/{user_id}/item/{item_id}")
async def read_user_item(
    user_id: int, item_id:str, q: Union[str, None] = None, short: bool = False
):
    item = {"item_id":item_id, "owner_id" : user_id}
    if q:
        item.update({"q": q})
    if not short:
        item.update(
            {"description": "This is an amazing item that has a long descirpytion"}
        )
    return item

@app.get("/")
def read_root():
    return {"Hello" : "World"}

@app.get("/items/{item_id}")
async def read_user_item(
    item_id: str, needy: str, skip: int = 0, limit: Union[int, None] = None
):
    item = {"item_id": item_id, "needy": needy, "skip": skip, "limit": limit}
    return item

# @app.get("/item/{item_id}")
# def read_item(item_id:str,q:Union[str, None] = None, short: bool = False):
#     item = {"item_id":item_id}
#     if q:
#         item.update({"q":q})
#     if not short:
#         item.update(
#             {"description": "This is an amazing item that has a long description"}
#         )
#     return item

# @app.get("/items/")
# async def read_item(skip : int = 0, limit: int = 10):
#     return fake_items_db [skip: skip + limit]

@app.get("/items/")
async def read_items(
    q : Union[str, None]=Query(
        default=None,
        alias = "item-query",
        min_length=3, 
        title="Query string",
        dscription="Query string for the items to serach in the database that have a good match",
        max_length=50, 
        pattern="^fixedquery",
        deprecated=True,
    ),
):
    results = {"items":[{"item_name": "Foo"}, {"item_name": "Bar"}]}
    if q:
        results.update({"q":q})
    return results

# @app.get("/items/")
# async def read_items(q:Union[List[str], None] = Query(default=None)): # 제공된 값이 없으면  기본 list 값을 정의 할 수 있음
#     query_items = {"q":q}
#     return query_items

@app.get("/users/me")
async def read_user_me():
    return {"user_id":"the current user"}

@app.get("/users/{user_id}")
async def read_user(user_id : str):
    return {"user_id": user_id}

@app.get("/models/{model_name}")
async def get_model(model_name: ModelName):
    if model_name is ModelName.alexnet:
        return {"model_name":model_name,"message":"Deep Learning FTW!"}
    
    if model_name.value == "lenet":
        return {"model_name":model_name,"message":"LeCNN all the images"}
    
    return {"model_name":model_name, "message":"Have some residuals"}

@app.get("/files/{file.path:path}")
async def read_file(file_path:str):
    return {"file_path":file_path}