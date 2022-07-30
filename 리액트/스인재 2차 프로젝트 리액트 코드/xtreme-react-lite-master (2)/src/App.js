import { useRoutes } from "react-router-dom";
import Themeroutes from "./routes/Router";
// import { useEffect } from "react";
import React, {useEffect, useState} from 'react'
import "views/About"
import "layouts/Header"

const App = (props) => {
  const routing = useRoutes(Themeroutes);

  const mem_id = sessionStorage.getItem('mem_id')
  console.log("app", mem_id)
  

  return <div className="dark"> {routing}</div>

};

export default App;