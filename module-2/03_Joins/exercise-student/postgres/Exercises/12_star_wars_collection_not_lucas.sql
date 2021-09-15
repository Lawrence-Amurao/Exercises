-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas (5 rows)
select title
from movie
join person on movie.director_id = person.person_id
join collection on movie.collection_id = collection.collection_id
where person_name != 'George Lucas' and collection_name = 'Star Wars Collection';

