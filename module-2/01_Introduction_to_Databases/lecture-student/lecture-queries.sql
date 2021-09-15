-- 1. SELECT
-- Use a SELECT statement to return a literal string
SELECT 'Hello SQL!';

-- Use a SELECT statement to add two numbers together (and label the result "sum")
SELECT 2+2 AS sum;

-- 2. SELECT ... FROM
-- Write queries to retrieve...
-- The names from all the records in the state table
SELECT state_name FROM state;

-- The names and populations of all cities
SELECT city_name, population FROM city;

-- All columns from the park table
select * from park;



-- 3. All values vs. distinct values
-- Write a query to retrieve the names of all cities and notice repeats (like Springfield and Columbus)
select city_name from city ORDER BY city_name DESC;

-- Do it again, but without the repeats (note the difference in row count)
select distinct city_name from city order by city_name desc;


-- 4. Filtering with WHERE
-- Write queries to retrieve...
-- The names of cities in California (CA)
select city_name from city where state_abbreviation = 'CA';

-- The names and state abbreviations of cities NOT in California
select city_name, state_abbreviation from city where state_abbreviation <> 'CA';

-- The names and areas of cities smaller than 25 square kilometers
select city_name, area from city where area < 25;
 
-- The names from all records in the state table that have no assigned census region
select state_name from state
where census_region is null;

-- The names and census regions from all records in the state table that have an assigned census region
select state_name, census_region from state where census_region is not null;


-- 5. WHERE with AND/OR
-- Write queries to retrieve...
-- The names, areas, and populations of cities smaller than 25 sq. km. with more than 100,000 people
select city_name, area, population from city where area < 25 and population > 100000;


-- The names and census regions of all states (and territories and districts) not in the Midwest region (including those that don't have any census region)
select state_name, census_region
from state
where census_region <> 'Midwest' or census_region is null;


-- The names, areas, and populations of cities in California (CA) or Florida (FL)
select city_name, area, population
from city
where state_abbreviation = 'CA' or state_abbreviation = 'FL';

select city_name, area, population
from city
where state_abbreviation in ('CA', 'FL');

-- The names, areas, and populations of cities in New England -- Connecticut (CT), Maine (ME), Massachusetts (MA), New Hampshire (NH), Rhode Island (RI) and Vermont (VT)
select city_name, area, population
from city
where state_abbreviation in ('CT', 'ME', 'MA', 'NH', 'RI', 'VT');


-- 6. SELECT statements involving math
-- Write a query to retrieve the names and areas of all parks in square METERS
-- (the values in the database are stored in square kilometers)
-- Label the second column "area_in_meters"
select park_name, (area * 1000) as area_in_meters
from park;


-- 7. LIKE
-- Write queries to retrieve...
-- The names of all cities that begin with the letter "A"
-- The names of all cities that end with "Falls"
-- The names of all cities that contain a space

select city_name
from city
where city_name like 'A%';

select city_name
from city
where city_name like '% Falls';

select city_name
from city
where city_name like '% %';



-- 8. BETWEEN
-- Write a query to retrieve the names and areas of parks of at least 100 sq. kilometers but no more than 200 sq. kilometers
select park_name, area
from park
where area between 100 and 200;


-- 9. DATES
-- Write a query to retrieve the names and dates established of parks established before 1900
select park_name, date_established
from park
where date_established < '1/1/1900';

