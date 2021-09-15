<template>
  <div class="main">
    <h2>Product Reviews for {{ name }}</h2>

    <p class="description">{{ description }}</p>
    <!-- Add the computed properties for ratings -->
    <div class="well-display">
      <div class="well">
        <span class="amount"> {{ averageRating }} </span>
        Average Rating
      </div>
      <div class="well">
        <span class="amount"> {{ numberOfOneStarReviews }} </span>
        1 Star Review(s)
      </div>
      <div class="well">
        <span class="amount"> {{ numberOfTwoStarReviews }} </span>
        2 Star Review(s)
      </div>
      <div class="well">
        <span class="amount"> {{ numberOfThreeStarReviews }} </span>
        3 Star Review(s)
      </div>
      <div class="well">
        <span class="amount"> {{ numberOfFourStarReviews }} </span>
        4 Star Review(s)
      </div>
      <div class="well">
        <span class="amount"> {{ numberOfFiveStarReviews }} </span>
        5 Star Review(s)
      </div>
    </div>
    <div
      class="review"
      v-for="review in reviews"
      v-bind:key="review.id"
      v-bind:class="{ favorited: review.favorited }"
    >
      <h4>{{ review.reviewer }}</h4>
      <div class="rating">
        <img
          src="../assets/star.png"
          v-for="n in review.rating"
          v-bind:key="n"
          v-bind:title="review.rating + ' Star Rating'"
        />
      </div>
      <h3>{{ review.title }}</h3>

      <p>{{ review.review }}</p>
      <p>
        Favorite?
        <input type="checkbox" v-model="review.favorited" />
      </p>
    </div>
  </div>
</template>

<script>
export default {
  name: "product-review",
  data() {
    return {
      name: "Cigar Parties for Dummies",
      description:
        "Host and plan the perfect cigar party for all" +
        " of your squirrelly friends",
      reviews: [
        {
          reviewer: "Malcom Gladwell",
          title: "What a Book!",
          rating: 3,
          review: "It certainly was a book.  I mean, I can see that.",
          favorited: false,
        },
        {
          reviewer: "Bob Bobberson",
          title: "I hate squirrels",
          rating: 1,
          review: "I like dogs and cats, not squirrels!",
          favorited: false,
        },
      ],
    };
  },
  computed: {
    //   Computed functions run once and the value is cached until it needs to
    //   recalculate
    averageRating() {
      let sum = this.reviews.reduce((currentSum, review) => {
        return currentSum + review.rating;
      }, 0);
      return sum / this.reviews.length;
    },
    numberOfOneStarReviews() {
      let count = 0;
      for (let i = 0; i < this.reviews.length; i++) {
        if (this.reviews[i].rating === 1) {
          count++;
        }
      }
      return count;
    },
    numberOfTwoStarReviews() {
      let count = 0;
      for (let i = 0; i < this.reviews.length; i++) {
        if (this.reviews[i].rating === 2) {
          count++;
        }
      }
      return count;
    },
    numberOfThreeStarReviews() {
      let count = 0;
      for (let i = 0; i < this.reviews.length; i++) {
        if (this.reviews[i].rating === 3) {
          count++;
        }
      }
      return count;
    },
    numberOfFourStarReviews() {
      let count = 0;
      for (let i = 0; i < this.reviews.length; i++) {
        if (this.reviews[i].rating === 4) {
          count++;
        }
      }
      return count;
    },
    numberOfFiveStarReviews() {
      let count = 0;
      for (let i = 0; i < this.reviews.length; i++) {
        if (this.reviews[i].rating === 5) {
          count++;
        }
      }
      return count;
    },
  },
};
</script>

<style scoped>
div.main {
  margin: 1rem 0;
}

div.main div.well-display {
  display: flex;
  justify-content: space-around;
}

div.main div.well-display div.well {
  display: inline-block;
  width: 15%;
  border: 1px black solid;
  border-radius: 6px;
  text-align: center;
  margin: 0.25rem;
}

div.main div.well-display div.well span.amount {
  color: darkslategray;
  display: block;
  font-size: 2.5rem;
}

div.main div.review {
  border: 1px black solid;
  border-radius: 6px;
  padding: 1rem;
  margin: 10px;
}

div.main div.review div.rating {
  height: 2rem;
  display: inline-block;
  vertical-align: top;
  margin: 0 0.5rem;
}

div.main div.review div.rating img {
  height: 100%;
}

div.main div.review p {
  margin: 20px;
}

div.main div.review h3 {
  display: inline-block;
}

div.main div.review h4 {
  font-size: 1rem;
}

div.main div.review.favorited {
  background-color: lightgoldenrodyellow;
}
</style>