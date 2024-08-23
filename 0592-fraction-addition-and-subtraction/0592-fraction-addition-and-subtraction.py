from fractions import Fraction

class Solution:
    def fractionAddition(self, expression: str) -> str:
        
        numbers = re.findall(r'[+-]?\d+/\d+', expression)
        result = Fraction(0, 1)
        for frac in numbers:
            result += Fraction(frac)
        
        return f"{result.numerator}/{result.denominator}"
        