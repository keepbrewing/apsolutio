package com.example.apsolutio2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private RecyclerView new_trending_list, recommended_list;
    private RecyclerView.Adapter adapter, madapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_home_fragment, container, false);


        ArrayList<Albums> albums = initAlbums();

        this.new_trending_list = (RecyclerView) v.findViewById(R.id.horizontal_recycler_view_new_trending);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, true);
        ((LinearLayoutManager) mLayoutManager).setReverseLayout(true);
        ((LinearLayoutManager) mLayoutManager).setStackFromEnd(true);

        this.new_trending_list.setLayoutManager(mLayoutManager);

        adapter = new AlbumsAdapter(albums);
        this.new_trending_list.setAdapter(adapter);

        this.recommended_list = (RecyclerView) v.findViewById(R.id.horizontal_recycler_view_recommended);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, true);
        ((LinearLayoutManager) layoutManager).setReverseLayout(true);
        ((LinearLayoutManager) layoutManager).setStackFromEnd(true);

        this.recommended_list.setLayoutManager(layoutManager);

        madapter = new AlbumsAdapter(albums);
        this.recommended_list.setAdapter(madapter);
        return v;
    }

    private ArrayList<Albums> initAlbums() {
        ArrayList<Albums> list = new ArrayList<>();
        list.add(new Albums("Fake Love", "Love Yourself: Tear", "https://upload.wikimedia.org/wikipedia/en/thumb/8/84/Fake_Love_%28Rocking_Vibe_Mix%29_Cover_Art.jpg/220px-Fake_Love_%28Rocking_Vibe_Mix%29_Cover_Art.jpg"));
        list.add(new Albums("Fake Love", "Love Yourself: Tear", "https://upload.wikimedia.org/wikipedia/en/thumb/8/84/Fake_Love_%28Rocking_Vibe_Mix%29_Cover_Art.jpg/220px-Fake_Love_%28Rocking_Vibe_Mix%29_Cover_Art.jpg"));
        list.add(new Albums("Fake Love", "Love Yourself: Tear", "https://upload.wikimedia.org/wikipedia/en/thumb/8/84/Fake_Love_%28Rocking_Vibe_Mix%29_Cover_Art.jpg/220px-Fake_Love_%28Rocking_Vibe_Mix%29_Cover_Art.jpg"));
        list.add(new Albums("Fake Love", "Love Yourself: Tear", "https://upload.wikimedia.org/wikipedia/en/thumb/8/84/Fake_Love_%28Rocking_Vibe_Mix%29_Cover_Art.jpg/220px-Fake_Love_%28Rocking_Vibe_Mix%29_Cover_Art.jpg"));
        list.add(new Albums("Fake Love", "Love Yourself: Tear", "https://upload.wikimedia.org/wikipedia/en/thumb/8/84/Fake_Love_%28Rocking_Vibe_Mix%29_Cover_Art.jpg/220px-Fake_Love_%28Rocking_Vibe_Mix%29_Cover_Art.jpg"));

        return list;
    }


}
