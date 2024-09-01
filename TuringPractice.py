# # count = {}
# # st = input()

# # for c in st:
# #     if c in count:
# #         count.pop(c)
# #     else:
# #         count[c] = 1
# #     # count[c] = count.get(c,0)+1

# # print(count)

# count = []
# st = input()

# for c in st:
#     if c in count:
#         print(c)
#     else: 
#         count.append(c)

# def is_prime(num):
#     if num < 2:
#         return False
#     for i in range(2, int(num ** 0.5) + 1):
#         if num % i == 0:
#             return False
#     return True

# def generate_spiral_matrix(n):
#     if n < 1:
#         return []

#     matrix = [[0] * n for _ in range(n)]
#     num = 1
#     row_start = 0
#     row_end = n - 1
#     col_start = 0
#     col_end = n - 1

#     while num <= n * n:
#         for i in range(col_start, col_end + 1):
#             if is_prime(num):
#                 matrix[row_start][i] = num
#                 num += 1
#         row_start += 1

#         for i in range(row_start, row_end + 1):
#             if is_prime(num):
#                 matrix[i][col_end] = num
#                 num += 1
#         col_end -= 1

#         for i in range(col_end, col_start - 1, -1):
#             if is_prime(num):
#                 matrix[row_end][i] = num
#                 num += 1
#         row_end -= 1

#         for i in range(row_end, row_start - 1, -1):
#             if is_prime(num):
#                 matrix[i][col_start] = num
#                 num += 1
#         col_start += 1

#     return matrix

# def print_matrix(matrix):
#     for row in matrix:
#         print(" ".join(str(cell) for cell in row))

# # Test the function
# n = int(input("Enter the size of the matrix (n x n): "))
# spiral_matrix = generate_spiral_matrix(n)
# print("Prime Spiral Matrix:")
# print_matrix(spiral_matrix)


# def permutations(arr):
#     if len(arr) == 0:
#         return [[]]
#     result = []
#     for i in range(len(arr)):
#         rest = arr[:i] + arr[i+1:]
#         # print(arr[:i])
#         for p in permutations(rest):
#             result.append([arr[i]] + p)
#     return result

# # Example
# sequence = [1, 2, 3]
# print("Permutations:")
# for perm in permutations(sequence):
#     print(perm)



# def count_identical_sets(words):
#     word_counts = {}
#     identical_sets = 0

#     # Count occurrences of each word
#     for word in words:
#         if word in word_counts:
#             word_counts[word] += 1
#         else:
#             word_counts[word] = 1

#     # Count identical sets
#     for count in word_counts.values():
#         identical_sets += count // 2

#     return identical_sets

# # Example
# word_list = ["apple", "banana", "apple", "orange", "banana", "banana", "orange"]
# print("Number of sets of identical words:", count_identical_sets(word_list))

# def longest_alternative_subsequence(sequence):
#     if not sequence:
#         return 0
    
#     max_length = 1
#     current_length = 1
    
#     for i in range(1, len(sequence)):
#         if sequence[i] != sequence[i - 1]:
#             current_length += 1
#         else:
#             max_length = max(max_length, current_length)
#             current_length = 1
    
#     max_length = max(max_length, current_length)
    
#     return max_length

# # Example
# sequence = [1, 1, 2, 2, 2, 3, 3, 3, 1, 1, 1,2,3,2]
# print("Length of the longest alternative subsequence:", longest_alternative_subsequence(sequence))

s=input()
n=len(s)
lt=int(input())
st=0
tp=s
i=0
j=1
flag=False
while(j<n):
    if s[i]==s[j]:
        st+=1
        i+=1
        j+=1
        flag=True
    else:
        i=0
        st=0
        if not flag:
            j+=1
        else:
            flag=False
print(i,st)

while len(s)<lt:
    s+=s[st:]
s=s[:lt]
i=0
j=n
con=0
print(1+((lt-n)//(n-st)))
while(j<=lt):
    if s[i:j]==tp:
        con+=1
    i+=1
    j+=1
print(con)
