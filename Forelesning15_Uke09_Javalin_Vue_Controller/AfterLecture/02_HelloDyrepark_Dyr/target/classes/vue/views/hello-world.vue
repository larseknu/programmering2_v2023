<template id="hello-world">
  <h1 class="hello-world">Hello, Vue!</h1>
</template>
<script>
   app.component("hello-world", {template: "#hello-world"})
</script>
<style>
  .hello-world {
    color: cornflowerblue;
    font-size: 34px;
  }
</style>