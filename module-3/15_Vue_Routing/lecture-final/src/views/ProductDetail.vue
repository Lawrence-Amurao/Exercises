<template>
  <div id="app" class="main">
    <h1>{{ product.name }}</h1>
    <p class="description">{{ product.description }}</p>
    <div class="actions">
      <router-link
        :to="{
          name: 'products',
        }"
      >
        Back To Products
      </router-link>
      <router-link
        :to="{
          name: 'add-review',
          params: {
            id: product.id,
          },
        }"
        >Add Review</router-link
      >
    </div>
    <div class="well-display">
      <average-summary />
      <star-summary rating="1" />
      <star-summary rating="2" />
      <star-summary rating="3" />
      <star-summary rating="4" />
      <star-summary rating="5" />

      <review-list />
    </div>
  </div>
</template>

<script>
import ReviewList from "../components/ReviewList.vue";
export default {
  components: { ReviewList },
  created() {
    const activeProductId = this.$route.params.id;
    this.$store.commit("SET_ACTIVE_PRODUCT", activeProductId);
  },
  computed: {
    // this computed function will return the correct product
    // object associated with the id that came from the url
    product() {
      return this.$store.state.products.find((p) => {
        return p.id == this.$store.state.activeProduct;
      });
    },
  },
};
</script>

<style>
</style>