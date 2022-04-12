<template>
  <iframe :src="targetUrl" width="100%" height="600" frameborder="0"></iframe>
</template>

<script>
export default {
  name: "Content",
  props: {
    targetUrl: String,
  },
};
</script>

<style></style>
