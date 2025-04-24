# Write your MySQL query statement below

delete from person
where id not  in (
select min_id from (select min(id) as min_id
from Person
group by email)as keepers
)