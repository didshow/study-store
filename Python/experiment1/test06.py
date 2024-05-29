if __name__ == "__main__":
    diet = ['西红柿','生菜','黄瓜','牛排','虾仁']
    for x in range(0,5):
        for y in range(0,5):
            if not (x==y):
                print("{}{}".format(diet[x],diet[y]))
