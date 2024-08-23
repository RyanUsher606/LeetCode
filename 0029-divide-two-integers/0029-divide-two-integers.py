class Solution:
    def divide(self, dividend: int, divisor: int) -> int:

        if dividend == 0:
            return 0
        if divisor == 1:
            return min(max(-2**31, dividend), 2**31 - 1)
        if divisor == -1:
            return min(max(-2**31, -dividend), 2**31 - 1)
    
        negative = (dividend < 0) != (divisor < 0)

        dividend, divisor = abs(dividend), abs(divisor)
    
        quotient = 0
    
        while dividend >= divisor:
            temp, multiple = divisor, 1
            while dividend >= (temp << 1):
                temp <<= 1
                multiple <<= 1
        
            dividend -= temp
            quotient += multiple
    
        if negative:
            quotient = -quotient

        return min(max(-2**31, quotient), 2**31 - 1)