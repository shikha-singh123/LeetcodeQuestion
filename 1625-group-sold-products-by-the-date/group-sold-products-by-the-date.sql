# Write your MySQL query statement below

select sell_date,count(distinct product) AS num_sold ,
group_concat(distinct product order by product) AS products
from activities 
group by sell_date