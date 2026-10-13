class Solution(object):
    def convert(self, s, numRows):
        
        # if only one row → no zigzag needed
        if numRows == 1:
            return s
        
        # create rows
        rows = [""] * numRows
        
        curr_row = 0
        going_down = False
        
        # go through each character
        for ch in s:
            rows[curr_row] += ch   # put character in row
            
            # if at top or bottom → change direction
            if curr_row == 0 or curr_row == numRows - 1:
                going_down = not going_down
            
            # move up or down
            if going_down:
                curr_row += 1
            else:
                curr_row -= 1
        
        # join all rows
        return "".join(rows)