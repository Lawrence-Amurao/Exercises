-- 11. Hollywood is remaking the classic movie "The Blob" and doesn't have a director yet. Add yourself to the person table, and assign yourself as the director of "The Blob" (the movie is already in the movie table). (1 record each)
select title, movie_id
from movie
where title = 'The Blob';
--367220

insert into person(person_name)
values('Lawrence Amurao');

update movie
set director_id = person.person_id from person
where movie_id = '367220';

select director_id
from movie
where movie_id = '367220';


