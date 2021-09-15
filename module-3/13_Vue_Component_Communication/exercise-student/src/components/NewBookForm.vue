<template>
    <form class="new-book-from" v-on:submit.prevent="addNewBook">
        <h2>Add New Book</h2>
        
            <input class="title-input" type="text" v-model="newBook.title" placeholder="Book Title">
            <input class="author-input" type="text" v-model="newBook.author" placeholder="Author">
            <input class="isbn-input" type="text" v-model="newBook.isbn" placeholder="ISBN">
            <button type="submit">Submit</button>
        
    </form>
</template>

<script>

export default {
    name:"new-book",
    data() {
        return {
            newBook: {
                read: false,
            },
        }
        
    },
    methods: {
        addNewBook() {
            this.$store.commit("NEW_BOOK", this.newBook);
        }

    }
}
</script>


