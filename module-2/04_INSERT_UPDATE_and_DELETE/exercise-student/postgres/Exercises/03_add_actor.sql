-- 3. Did you know Eric Stoltz was originally cast as Marty McFly in "Back to the Future"? Add Eric Stoltz to the list of actors for "Back to the Future" (1 row)
SELECT person_id, person_name
from person
where person_name = 'Eric Stoltz';

Select movie_id, title
from movie
where title = 'Back to the Future';

insert into movie_actor (movie_id, actor_id)
values ('105', '7036');