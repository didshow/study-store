if __name__ == "__main__":
    fp = open("file" ,"r")
    print(fp.seek(1,0))
    print(fp.read())
    print(fp.close())
