class Solution(object):
    def reverse(self, x):
        sign = -1 if x < 0 else 1
        x = abs(x)
        
        rev = 0
        
        while x != 0:
            digit = x % 10
            x = x // 10
            
            # overflow check
            if rev > 2147483647 // 10:
                return 0
            
            rev = rev * 10 + digit
        
        return sign * rev if -2**31 <= sign * rev <= 2**31 - 1 else 0