# Write your MySQL query statement below

Select product_name,s.year, s.price 
FROM sales s
join product p
ON p.product_id=s.product_id;