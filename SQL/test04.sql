-- 코드를 입력하세요
SELECT *
FROM FOOD_PRODUCT
WHERE
  (SELECT MAX(PRICE)
   FROM FOOD_PRODUCT) = PRICE
