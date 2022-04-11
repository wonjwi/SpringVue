<template>
  <b-dropdown-item class="sub-menu" @click="clickMenu(url)">
    {{ name }}
  </b-dropdown-item>
</template>

<script>
export default {
  name: "SubMenuItem",
  props: {
    name: String,
    url: String,
  },
  methods: {
    clickMenu(url) {
      this.$emit("setUrl", url);
    },
  },
};
</script>

<style></style>
