-- 코드를 입력하세요

Select CATEGORY ,PRICE as MAXPRICE ,PRODUCT_NAME
from FOOD_PRODUCT
where price in (select max(price) from FOOD_PRODUCT group by category) and category in ('과자', '국', '김치', '식용유')
order by price desc