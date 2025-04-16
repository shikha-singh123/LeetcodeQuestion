# Write your MySQL query statement below

select  distinct p.project_id , round(avg(e.experience_years),2) as average_years
from Project as p
left join employee as e
on p.employee_id=e.employee_id

group by p.project_id