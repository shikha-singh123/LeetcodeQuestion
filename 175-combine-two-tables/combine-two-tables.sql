# Write your MySQL query statement below

SELECT p.lastName,p.firstName,a.city,a.state
FROM Person p
LEFT JOIN Address a
on p.personId=a.personId;