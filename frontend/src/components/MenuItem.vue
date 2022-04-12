<template>
  <b-button
    v-if="sub.length == 0"
    variant="outline-secondary"
    @click="clickMenu(main.url)"
  >
    {{ main.name }}
  </b-button>
  <b-dropdown v-else :text="main.name" dropright variant="outline-secondary">
    <SubMenuItem
      v-for="(subMenuItem, index) in sub"
      :key="index"
      :name="subMenuItem.name"
      :url="subMenuItem.url"
      @setUrl="clickMenu"
    />
  </b-dropdown>
</template>

<script>
import SubMenuItem from "@/components/SubMenuItem.vue";

export default {
  name: "MenuItem",
  components: {
    SubMenuItem,
  },
  props: {
    main: Object,
    sub: Array,
  },
  methods: {
    clickMenu(url) {
      this.$emit("setUrl", url);
    },
  },
};
</script>

<style></style>
