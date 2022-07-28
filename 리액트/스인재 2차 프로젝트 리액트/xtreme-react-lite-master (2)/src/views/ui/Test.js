import { Component } from "react";
import Table from "react-bootstrap/Table";
import Button from "react-bootstrap/Button";
import 'css/Board.css';
import Comment from 'views/ui/Comment'; 
import { Link, useParams } from "react-router-dom";
import {useEffect,useState} from "react";
import Axios from "axios";
import { useLocation } from 'react-router-dom';

// class BoardList extends Component {
    
function Test(){

    const stateTest = useLocation().state;
    console.log(stateTest);

     return (<div>Test</div>);
}


export default Test;