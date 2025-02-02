from sqlalchemy import Column, Integer, String, Date, ForeignKey
from sqlalchemy.ext.declarative import declarative_base
from sqlalchemy.orm import relationship

Base = declarative_base()

class User(Base):
    __tablename__ = "users"

    id = Column(Integer, primary_key = True, index = True, autoincrement=True)
    name = Column(String(15))
    password = Column(String(30))
    phoneNumber = Column(String(15), unique=True, index=True)

class Bank_Info(Base):
    __tablename__ = "Bank_Info"

    id = Column(Integer, primary_key=True, index=True, autoincrement=True)
    userId = Column(Integer, ForeignKey("users.id"))
    account = Column(String(20))
    balance = Column(Integer)

class Auth_user(Base):
    __tablename__ = "user_auths"

    id = Column(Integer, primary_key=True, index=True)
    userId = Column(Integer, ForeignKey("users.id"))
    token = Column(String(255))