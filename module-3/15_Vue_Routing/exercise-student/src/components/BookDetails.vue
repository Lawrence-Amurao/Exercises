<template>
  <div class="book-container">
    <book-card v-bind:book="$store.state.books.find(book => book.isbn === $route.params.isbn)" />
  </div>
</template>

<script>
import BookCard from '@/components/BookCard.vue';

export default {
    name: 'book',
    components: {
        BookCard
        

    }
}
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>