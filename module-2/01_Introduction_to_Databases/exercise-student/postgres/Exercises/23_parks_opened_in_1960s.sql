-- 23. The name and date established of parks opened in the 1960s (6 rows)
select park_name, date_established
from park
where date_established > '12/31/1959' and date_established <= '1/1/1970';

