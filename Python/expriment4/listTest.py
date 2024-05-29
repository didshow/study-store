if __name__ == "__main__":
    print([i**2 for i in range(10)])    # [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
    print([(i,i**2) for i in range(10)])    # [(0, 0), (1, 1), (2, 4), (3, 9), (4, 16), (5, 25), (6, 36), (7, 49), (8, 64), (9, 81)]
    print([i for i in range(10) if i%2 ==0])    # [0, 2, 4, 6, 8]
    print([(x,y,x*y)for x in range(1,4) for y in range(1,4) if x >= y]) # [(1, 1, 1), (2, 1, 2), (2, 2, 4), (3, 1, 3), (3, 2, 6), (3, 3, 9)]