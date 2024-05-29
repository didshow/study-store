import random

if __name__ == "__main__":
    # 定义奖项的范围
    prize_ranges = {
        '一等奖': range(0, 31),
        '二等奖': range(31, 109),
        '三等奖': range(109, 361)
    }

    # 初始化奖项计数器
    prize_counts = {k: 0 for k in prize_ranges}
    # 定义函数：根据随机数获取中奖奖项
    def get_prize(angle):
        for k, v in prize_ranges.items():
            if angle in v:
                return k
        return None


    # 模拟10000次抽奖
    for i in range(10000):
        # 生成随机角度
        angle = random.randint(0, 360)
        # 获取中奖奖项
        prize = get_prize(angle)
        # 统计中奖次数
        if prize:
            prize_counts[prize] += 1

    # 输出各个奖项的中奖次数
    for k, v in prize_counts.items():
        print(f'{k}: {v} 次')