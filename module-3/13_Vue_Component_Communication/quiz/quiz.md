1. Given a `MoviesList` component, which of the following options allows `<movies-list v-bind:movies="listOfMovies">`?

    a.
    ```js
    export default {
      name: 'movies-list',
      data() {
        return {
          movies: []
        }
      }
    }
    ```
    b.
    ```js
    export default {
      name: 'movies-list',
      computed: {
        movies() {
          return [];
        }
      }
    }
    ```
    c.
    ```js
    export default {
      name: 'movies-list',
      input() {
        return {
          movies: []
        }
      }
    }
    ```
    d. *
    ```js
    export default {
      name: 'movies-list',
      props: ['movies']
    }
    ```

    Correct:
      d. This sets up a new prop called `movies` that another parent component can bind data to.
    Wrong:
      a. This creates data that the component can use, but doesn't have `props:` that can be used as an attribute in HTML.
      b. This creates a computed property called `movies`. This can't be changed from the outside or set inside the component since it's a method.
      c. `input()` is not a section that a component can have.

2. Given a `MoviesList` component, which of the following options allows `<movies-list search="Club">`?

    a.
    ```js
    export default {
      name: 'movies-list',
      data() {
        return {
          movies: [],
          search: ''
        }
      }
    }
    ```
    b.
    ```js
    export default {
      name: 'movies-list',
      computed: {
        movies() {
          return [];
        }
      },
      data() {
        return {
          search: ''
        }
      }
    }
    ```
    c.
    ```js
    export default {
      name: 'movies-list',
      input() {
        return {
          movies: [],
          search: ''
        }
      }
    }
    ```
    d. *
    ```js
    export default {
      name: 'movies-list',
      data() {
        return {
          movies: []
        }
      }
      props: ['search']
    }
    ```

    Correct:
      d. This sets up a new prop called `search` that can be used as an attribute in HTML.
    Wrong:
      a. This creates data that the component can use, but doesn't have `props:` that can be used as an attribute in HTML.
      b. This creates data that the component can use, but doesn't have `props:` that can be used as an attribute in HTML.
      c. `input()` is not a section that a component can have.

3. Why should your components follow the Single Responsibility Principle (SRP)?

    a. You don't want your files to get too large.
    b. Computers can only do one thing at a time.
    c. It makes it easier to maintain, test, and reuse your components. *
    d. Because developers are paid by lines of code written.

    Correct:
      c. Having focused components means that working on a new feature or fixing a bug causes few changes to the whole application if each component only handles one small aspect of the application.
    Wrong:
      a. This isn't a big concern, and you may still have large files in the application even if you follow SRP.
      b. This isn't quite true since some applications support parallelism.
      d. Sadly not true. Wouldn't that be great, though?

4. Given `MoviesList.vue`, as declared below, which of the following do you need to do to add it into another component? (select all that apply)

    ```js
    export default {
      name: 'movies-list'
    }
    ```

    a. *
    ```html
    <script>
      import MoviesList from './components/MoviesList.vue';
    </script>
    ```
    b. *
    ```html
    <script>
      export default {
        components: {
          MoviesList
      }
    };
    </script>
    ```
    c.
    ```html
    <template>
      <Movies></Movies>
    </template>
    ```
    d.
    ```html
    <script>
      import default {
        modules: [
          './MoviesList.vue'
        ]
    };
    </script>
    ```
    e. *
    ```html
    <template>
      <movies-list></movies-list>
    </template>
    ```

    Correct:
      a. b. and e. These are all needed to include a component in another component. (a) imports the component, (b) defines the component as a sub-component, and (e) includes the component in the view.
    Wrong:
      c. This is not the correct HTML for the imported component.
      d. There is no modules section for a component.

5. Given the component below, how would you pass an object named `productReviews` into it from a parent component?

    ```html
    <template>
      <div v-for="review in reviews" v-bind:key="review.id"></article>
    </template>

    <script>
      export default {
        name: 'book-reviews',
        props: ['reviews']
      };
    </script>
    ```
    a.
    ```html
    <book-reviews v-prop="productReviews"></book-reviews>
    ```
    b.
    ```html
    <product-reviews v-bind:prop="book-reviews"></product-reviews>
    ```
    c. *
    ```html
    <book-reviews v-bind:reviews="productReviews"></book-reviews>
    ```
    d.
    ```html
    <product-reviews v-prop="book-reviews"></product-reviews>
    ```

    Correct:
      c. You'd use `v-bind:reviews` to connect to the `reviews` prop, and then the data from `productReviews` is passed to it.
    Wrong:
      a. and d. `v-prop` is not an actual directive.
      b. There is no prop called `prop`, and `book-reviews` is the name of the component, not a data property.

6. How would a component access an object named `pets` kept in a Vuex datastore?

    a. `this.$store.data.pets`
    b. `this.$data.store.pets`
    c. `this.$store.state.pets` *
    d. `this.$vuex.data.pets`
    e. `this.$store.pets`

    Correct:
      c. To access `pets` in the datastore from a component, you'd go through `this.$store`, and then access the `state` to get the `pets` object.
    Wrong:
      a. A datastore doesn't have a `data` section. It is called `state`.
      b. A component won't have access to a datastore from a `this.$data` property.
      d. A component won't have access to a datastore from a `this.$vuex` property.
      e. `pets` won't be available directly from `this.$store`.

7. How do you call a mutation called `ADD_REVIEW`?

    a. `this.$store.ADD_REVIEW();`
    b. `this.$store.commit('ADD_REVIEW');` *
    c. `this.$store.mutation('ADD_REVIEW');`
    d. `this.$store.mutation.ADD_REVIEW();`
    e. `this.$store.trigger('ADD_REVIEW');`

    Correct:
      b. A mutation needs to be committed, much like in git.
    Wrong:
      a. You do not call a mutation like a method.
      c. `mutation()` is not the correct method. You should call `commit()`.
      d. `mutation` is not an object on the store.
      e. `trigger()` is not the correct method. You should call `commit()`.
