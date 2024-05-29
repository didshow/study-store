if __name__ == "__main__":
    dict()
    {'a':'apple','b':'boy'}
    print(dict())   # {}
    print(dict({1:'food',2:'drink'}))   #  {1: 'food', 2: 'drink'}
    print(dict([('id','1001'),('name','Jenny')]))   # {'id': '1001', 'name': 'Jenny'}
    print(dict(baidu='baidu.com',google='google.com'))  # {'baidu': 'baidu.com', 'google': 'google.com'}
    person = {"li":18,"wang":50,"zhang":20,"sun":22}
    max_age = 0
    for key,value in person.items():
        if value >= max_age:
            max_age = value
            name = key
    print(name) # wang
    print(max_age)  # 50