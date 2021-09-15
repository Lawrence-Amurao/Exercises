<template>
  <div>
    <h1>{{ card.title }}</h1>
    <p>{{ card.description }}</p>
    <div class="loading" v-if="isLoading">
      <img
        src="../assets/ping_pong_loader.gif"
        alt="animated ping pong loader"
      />
    </div>
    <div class="loadedContent" v-else>
      <comments-list v-bind:comments="card.comments" />
      <router-link
        :to="{
          name: 'Board',
          params: {
            id: this.$route.params.boardID,
          },
        }"
      >
        Back to Board
      </router-link>
    </div>
  </div>
</template>

<script>
import boardsService from "../services/BoardService";
import CommentsList from "./CommentsList.vue";

export default {
  components: { CommentsList },
  name: "card-detail",
  data() {
    return {
      card: {
        title: "",
        description: "",
        status: "",
        comments: [],
      },
      isLoading: true,
    };
  },
  created() {
    boardsService
      .getCard(this.$route.params.boardID, this.$route.params.cardID)
      .then((response) => {
        this.card = response;
        this.isLoading = false;
      });
  },
};
</script>
