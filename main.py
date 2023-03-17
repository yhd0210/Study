from fastapi import FastAPI
app = FastAPI()

from fastapi.responses import FileResponse
from pydantic import BaseModel

# class Model(BaseModel): #BaseModel를 사용한 유저에게 data받기
#     name:str
#     phoneNumber:int

# @app.post("/send")
# def data받기(data:Model):
#     print(data)
#     return '전송완료'

# @app.get("/") # 비동기 처리
# async def 비동기():
#     result = await some_library()
#     return result

@app.get("/")
def name():
    return '이재하'

@app.get("/second page")
def cat():
    return{'고양이':'야옹'}

@app.get("/")
def html문서():
    return FileResponse('index.html')