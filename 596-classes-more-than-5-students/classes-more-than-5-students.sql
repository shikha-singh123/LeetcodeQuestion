# Write your MySQL query statement below

SELECT class FROM courses
group by class
HAVING count(student)>=5  