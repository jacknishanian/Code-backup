
mode_list = [15, 12, 1, 22, 26, 45, 43]
from collections import Counter
data = Counter(mode_list)
print(Counter(mode_list).most_common(1)[0][0])

def mean(numbers):
    return float(sum(numbers)) / max(len(numbers), 1)

print(mean(mode_list))