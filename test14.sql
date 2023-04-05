-- 코드를 입력하세요
SELECT A.CATEGORY, SUM(B.SALES) AS TOTAL_SALES
FROM BOOK AS A, BOOK_SALES AS B
WHERE A.BOOK_ID = B.BOOK_ID
    AND B.SALES_DATE LIKE '2022-01-%'
GROUP BY A.CATEGORY
ORDER BY A.CATEGORY ASC