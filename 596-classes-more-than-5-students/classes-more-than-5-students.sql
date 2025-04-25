# Write your MySQL query statement below
SELECT c.class
FROM Courses c
GROUP BY c.class
HAVING COUNT(C.student)>=5;