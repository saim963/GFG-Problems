class Solution:
    def isSubSeq(self, s1, s2):
        p1,p2 = 0,0
        while p2<len(s2) and p1<len(s1):
            if s2[p2] == s1[p1]:
                p1+=1
                p2+=1
            else:
                p2+=1
            if p1==len(s1):
                return True
        return False