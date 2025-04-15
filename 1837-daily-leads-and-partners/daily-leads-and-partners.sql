# Write your MySQL query statement below

select date_id,make_name,count(distinct lead_id) AS unique_leads,
count(distinct partner_id) AS unique_partners
from dailysales d
group by date_id,make_name
