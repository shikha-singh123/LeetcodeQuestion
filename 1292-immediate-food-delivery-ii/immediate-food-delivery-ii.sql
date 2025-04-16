-- # Write your MySQL query statement below

-- Select avg(case when order_date=customer_pref_delivery_date
-- then 'immediate' else 'scheduled' end) 
-- (case when 'immediate' then 1 else end)
-- as immediate_percentage
-- from delivery

-- group by customer_id

select round(sum(if(order_date=customer_pref_delivery_date,1,0))*100/count(
distinct customer_id),2) as immediate_percentage
from delivery
where(customer_id,order_date)in(
select customer_id,min(order_date) as first_order_date
from delivery
group by customer_id
)
