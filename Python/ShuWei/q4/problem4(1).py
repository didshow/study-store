def can_be_together(item1, item2, matrix):
    return matrix[item1][item2] == 1 and matrix[item2][item1] == 1

def add_to_group(item, groups, matrix):
    for group in groups:
        if all(can_be_together(item, member, matrix) for member in group):
            group.append(item)
            return True
    return False

def find_min_groups(matrix):
    n = len(matrix)  # Number of items
    groups = []  # List to store the result groups

    for item in range(n):
        if not add_to_group(item, groups, matrix):
            # Item could not be added to existing groups, create a new group
            groups.append([item])

    return groups

# Given matrix
matrix = [
    [1, 0, 1, 1, 1, 1, 0, 0],
    [0, 1, 0, 0, 0, 0, 0, 1],
    [1, 0, 1, 0, 0, 1, 1, 1],
    [1, 0, 0, 1, 0, 1, 1, 1],
    [1, 0, 0, 0, 1, 0, 1, 1],
    [1, 0, 1, 1, 0, 1, 1, 1],
    [0, 0, 1, 1, 1, 1, 1, 1],
    [0, 1, 1, 1, 1, 1, 1, 1]
]

# Finding the minimum groups
groups = find_min_groups(matrix)

# Display the groups
for i, group in enumerate(groups, start=1):
    print(f"Group {i}: {', '.join(str(item + 1) for item in group)}")
