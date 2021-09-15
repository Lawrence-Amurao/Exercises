-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985 (20 rows)
select distinct person_name, birthday
from person
join movie_actor on person.person_id = movie_actor.actor_id
join movie on movie_actor.movie_id = movie.movie_id
where birthday > '1949/12/31' and birthday < '1960/01/01' and release_date > '1984/12/31' and release_date < '1986/01/01';

