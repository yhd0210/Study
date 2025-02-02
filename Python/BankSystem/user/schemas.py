from pydantic import BaseModel

class User(BaseModel):
    userName : str
    
class Login(BaseModel):
    userName: str
    password: str

class SignUp(BaseModel):
    auth_code : int
    userName : str
    phoneNumber : str
    password : str
    confirm_password : str