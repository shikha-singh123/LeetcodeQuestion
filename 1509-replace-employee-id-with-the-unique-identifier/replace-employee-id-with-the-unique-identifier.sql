# Write your MySQL query statement below

SELECT eu.unique_id,e.name
FROM Employees e
LEFT JOIN EmployeeUNI eu
ON e.id=eu.id
WHERE eu.unique_id IS NULL
OR eu.unique_id IS NOT NULL
