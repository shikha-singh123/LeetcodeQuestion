# Write your MySQL query statement below

select u.name, sum(t.amount) AS balance
from users u
left join transactions t
ON  u.account=t.account
group by u.account
having sum(t.amount)>10000