<template>
  <b-button-group class="menu-div" vertical>
    <MenuItem
      v-for="(menuItem, index) in menuList"
      class="menu-item"
      :key="index"
      :main="menuItem.main"
      :sub="menuItem.sub"
      @setUrl="setUrl"
    />
  </b-button-group>
</template>

<script>
import MenuItem from "@/components/MenuItem.vue";

export default {
  name: "NavBar",
  components: {
    MenuItem,
  },
  props: {
    menuList: Array,
  },
  methods: {
    setUrl(url) {
      this.$emit("setUrl", url);
    },
  },
};
</script>

<style>
.menu-div {
  width: 100%;
}
.menu-item {
  height: 50px;
}
</style>
