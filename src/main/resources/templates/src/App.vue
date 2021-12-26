<template>
  <div id="app">
    <b-navbar toggleable type="danger" variant="danger">
      <b-navbar-toggle target="navbar-toggle-collapse">
        <template #default="{ expanded }">
          <b-icon
            v-if="expanded"
            icon="chevron-bar-up"
            style="color: #000000"
          ></b-icon>
          <b-icon
            v-else
            icon="chevron-bar-down"
            style="color: #000000"
          ></b-icon>
        </template>
      </b-navbar-toggle>

      <b-navbar-brand to="/" class="text-white">MyCineList</b-navbar-brand>

      <b-collapse id="navbar-toggle-collapse" is-nav>
        <b-navbar-brand>
          <b-nav-item-dropdown
            toggle-class="text-white"
            class="text-decorate-none"
            style="list-style-type: none"
            text="Filme"
          >
            <b-dropdown-item to="/home-f">Home</b-dropdown-item>
            <b-dropdown-item to="/cadastro-f">Cadastrar</b-dropdown-item>
          </b-nav-item-dropdown>
        </b-navbar-brand>
        <b-navbar-brand>
          <b-nav-item-dropdown
            toggle-class="text-white"
            class="text-decorate-none"
            style="list-style-type: none"
            text="Série"
          >
            <b-dropdown-item to="/home-s">Home</b-dropdown-item>
            <b-dropdown-item to="/cadastro-s">Cadastrar</b-dropdown-item>
          </b-nav-item-dropdown>
        </b-navbar-brand>
      </b-collapse>
    </b-navbar>
    <router-view />
  </div>
</template>

<style>
</style>
