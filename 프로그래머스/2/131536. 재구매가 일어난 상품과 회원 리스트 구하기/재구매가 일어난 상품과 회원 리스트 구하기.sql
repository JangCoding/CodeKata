-- 코드를 입력하세요
SELECT USER_ID ,  PRODUCT_ID
FROM ONLINE_SALE OS
GROUP BY USER_ID , PRODUCT_ID
HAVING COUNT(PRODUCT_ID) > 1
ORDER BY USER_ID ASC, PRODUCT_ID DESC

-- GROUP 으로 ID 와 PRODUCT 를 묶고,
-- 묶은 결과 내에서 HAVING 사용 (그룹화된 결과 집합에서 특정 조건을 충족하는 행을 필터링하는 데 사용됩)
