<template>
  <b-container>
    <Header />
    <b-row>
      <b-col cols="2">
        <NavBar :menuList="menuList" @setUrl="setUrl" />
      </b-col>
      <b-col cols="10">
        <Content :targetUrl="targetUrl" />
      </b-col>
    </b-row>
  </b-container>
</template>

<script>
import Header from "@/components/Header.vue";
import NavBar from "@/components/NavBar.vue";
import Content from "@/components/Content.vue";

export default {
  name: "Home",
  components: {
    Header,
    NavBar,
    Content,
  },
  data() {
    return {
      menuList: {},
      targetUrl: "",
    };
  },
  created() {
    // 메뉴 목록 불러오기
    this.setMenu();
  },
  methods: {
    setMenu() {
      // Sample Data
      this.menuList = [
        {
          main: {
            name: "대시보드",
            url: "http://192.168.0.183:16000/page/dashBoard",
          },
          sub: [],
        },
        {
          main: {
            name: "리소스 관리",
            url: "",
          },
          sub: [
            {
              name: "사용자 관리",
              url: "http://192.168.0.183:16000/page/resource/userManage",
            },
            {
              name: "조직 관리",
              url: "http://192.168.0.183:16000/page/resource/org/list",
            },
          ],
        },
        {
          main: {
            name: "소스 시스템",
            url: "http://192.168.0.183:16000/page/source/scheduler/history",
          },
          sub: [],
        },
        {
          main: {
            name: "타겟 시스템",
            url: "http://192.168.0.183:16000/page/target/scheduler/history",
          },
          sub: [],
        },
        {
          main: {
            name: "시스템 관리",
            url: "",
          },
          sub: [
            {
              name: "체계 관리",
              url: "http://192.168.0.183:16000/page/environment/taskSystem/list",
            },
            {
              name: "스케줄러 업무 관리",
              url: "http://192.168.0.183:16000/page/scheduler/job/list",
            },
            {
              name: "IP 접근 관리",
              url: "http://192.168.0.183:16000/page/access/address/list",
            },
          ],
        },
      ];
    },
    setUrl(url) {
      this.targetUrl = url;
      console.log(url);
    },
  },
};
</script>

<style></style>
